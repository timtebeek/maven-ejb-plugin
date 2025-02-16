/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.maven.plugins.ejb.stub;

import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import org.apache.maven.model.Model;
import org.apache.maven.model.Parent;
import org.apache.maven.model.Profile;

/**
 * Stub
 */
public class ModelStub extends Model {
    /**
     *
     */
    private static final long serialVersionUID = -6823174384695495659L;

    public ModelStub() {}

    public String getVersion() {
        return "0.0-TEST";
    }

    public String getModelVersion() {
        return "0.0-TEST";
    }

    public String getName() {
        return "Test Model";
    }

    public String getGroupId() {
        return "org.apache.maven.test";
    }

    public String getPackaging() {
        return "jar";
    }

    public Parent getParent() {
        // return new Parent();
        return null;
    }

    public String getArtifactId() {
        return "maven-test-plugin";
    }

    public Properties getProperties() {
        return new Properties();
    }

    public List<Profile> getProfiles() {
        return new LinkedList<Profile>();
    }
}
