/*
 * Copyright 2016 Red Hat, Inc.
 * <p>
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */
package war;

import org.apache.camel.Header;

/**
 */
public class Main {

    public Object main(String body, @Header("name") String name) {
        if (name != null) {
            return "Hello " + name + ". I got payload `" + body + "` and I am on host: " + System.getenv("HOSTNAME");
        } else {
            return "What is your name? Specify a name using ?name=foo as query parameter. I am on host: " + System.getenv("HOSTNAME");
        }
    }

}
