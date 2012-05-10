/**
 * Copyright (C) 2012 LinkedIn Inc <opensource@linkedin.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.linkedin.helix.model;

/**
 * The name of a resource
 */
public class Partition
{
  private final String _partitionName;

  public String getPartitionName()
  {
    return _partitionName;
  }

  public Partition(String partitionName)
  {
    this._partitionName = partitionName;
  }

  @Override
  public boolean equals(Object obj)
  {
    if(obj == null || !(obj instanceof Partition)){
      return false;
    }

    Partition that = (Partition)obj;
    return _partitionName.equals(that.getPartitionName());
  }

  @Override
  public int hashCode()
  {
    return _partitionName.hashCode();
  }

  @Override
  public String toString()
  {
    return _partitionName;
  }
}
