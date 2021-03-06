/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.knox.gateway.topology.simple;

import org.apache.knox.gateway.i18n.messages.Message;
import org.apache.knox.gateway.i18n.messages.MessageLevel;
import org.apache.knox.gateway.i18n.messages.Messages;
import org.apache.knox.gateway.i18n.messages.StackTrace;

@Messages(logger="org.apache.gateway.topology.simple")
public interface SimpleDescriptorMessages {

    @Message(level = MessageLevel.ERROR,
            text = "Service discovery for cluster {0} failed.")
    void failedToDiscoverClusterServices(final String cluster);

    @Message(level = MessageLevel.ERROR,
            text = "No valid URLs were discovered for {0} in the {1} cluster.")
    void failedToDiscoverClusterServiceURLs(final String serviceName, final String clusterName);

    @Message(level = MessageLevel.ERROR,
            text = "Failed to resolve the referenced provider configuration {0}.")
    void failedToResolveProviderConfigRef(final String providerConfigRef);

    @Message(level = MessageLevel.ERROR,
        text = "Failed to parse the referenced provider configuration {0}: {1}")
    void failedToParseProviderConfig(final String providerConfigRef,
                                     @StackTrace( level = MessageLevel.DEBUG ) Exception e);

    @Message(level = MessageLevel.ERROR,
            text = "URL validation failed for {0} URL {1} : {2}")
    void serviceURLValidationFailed(final String serviceName,
                                    final String url,
                                    @StackTrace( level = MessageLevel.DEBUG ) Exception e);

    @Message(level = MessageLevel.ERROR,
            text = "Error generating topology {0} from simple descriptor: {1}")
    void failedToGenerateTopologyFromSimpleDescriptor(final String topologyFile,
                                                      @StackTrace( level = MessageLevel.DEBUG ) Exception e);

    @Message( level = MessageLevel.ERROR,
              text = "Error creating a password for query string encryption for {0}: {1}" )
    void exceptionCreatingPasswordForEncryption(String topologyName,
                                                @StackTrace( level = MessageLevel.DEBUG) Exception e);

    @Message( level = MessageLevel.ERROR,
            text = "Failed to create a password for query string encryption for {0}." )
    void unableCreatePasswordForEncryption(String topologyName);

}
