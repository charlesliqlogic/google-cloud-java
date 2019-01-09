/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.pubsub.v1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/** A resettable Distribution uses com.google.api.gax.core.Distribution as a delegate. */
public class Distribution {
  private final int endValue;
  private com.google.api.gax.core.Distribution delegate;
  private final Lock lock = new ReentrantLock();

  public Distribution(int endValue) {
    this.endValue = endValue;
    this.delegate = new com.google.api.gax.core.Distribution(endValue);
  }

  public long getNthPercentile(double percentile) {
    return this.delegate.getNthPercentile(percentile);
  }

  public int getPercentile(double percentile) {
    return this.delegate.getPercentile(percentile);
  }

  public void record(int value) {
    lock.lock();
    try {
      this.delegate.record(value);
    } finally {
      lock.unlock();
    }
  }

  public String toString() {
    return this.delegate.toString();
  }

  public void reset() {
    lock.lock();
    try {
      this.delegate = new com.google.api.gax.core.Distribution(this.endValue);
    } finally {
      lock.unlock();
    }
  }
}
