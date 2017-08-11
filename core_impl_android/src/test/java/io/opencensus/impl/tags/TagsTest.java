/*
 * Copyright 2017, Google Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.opencensus.impl.tags;

import static com.google.common.truth.Truth.assertThat;

import io.opencensus.tags.TagContextSerializer;
import io.opencensus.tags.Tags;
import io.opencensus.tags.TagsComponent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Test for accessing the {@link TagsComponent} through the {@link Tags} class. */
@RunWith(JUnit4.class)
public final class TagsTest {
  @Test
  public void getTagContexts() {
    assertThat(Tags.getTagContexts()).isInstanceOf(TagContextsImpl.class);
  }

  @Test
  public void getTagContextSerializer() {
    assertThat(Tags.getTagContextSerializer()).isInstanceOf(TagContextSerializer.class);
  }
}
