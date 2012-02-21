package com.linkedin.helix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.linkedin.helix.ConfigScope.ConfigScopeProperty;

public class ConfigScopeBuilder
{
  private static Logger LOG = Logger.getLogger(ConfigScopeBuilder.class);

  private Map<ConfigScopeProperty, String> _scopeMap;

  Map<ConfigScopeProperty, String> getScopeMap()
  {
    return _scopeMap;
  }

  public ConfigScopeBuilder()
  {
    _scopeMap = new HashMap<ConfigScopeProperty, String>();
  }

  public ConfigScopeBuilder forCluster(String clusterName)
  {
    _scopeMap.put(ConfigScopeProperty.CLUSTER, clusterName);
    return this;
  }

  public ConfigScopeBuilder forParticipant(String participantName)
  {
    _scopeMap.put(ConfigScopeProperty.PARTICIPANT, participantName);
    return this;
  }

  public ConfigScopeBuilder forResource(String resourceName)
  {
    _scopeMap.put(ConfigScopeProperty.RESOURCE, resourceName);
    return this;

  }

  public ConfigScopeBuilder forPartition(String partitionName)
  {
    _scopeMap.put(ConfigScopeProperty.PARTITION, partitionName);
    return this;

  }

  public ConfigScope build()
  {
    // TODO: validate the scopes map

    return new ConfigScope(this);
  }

}
