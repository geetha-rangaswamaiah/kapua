/*******************************************************************************
 * Copyright (c) 2017, 2020 Eurotech and/or its affiliates and others
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.integration.service.datastore;

import cucumber.api.CucumberOptions;
import org.eclipse.kapua.qa.common.cucumber.CucumberProperty;
import org.eclipse.kapua.qa.common.cucumber.CucumberWithProperties;
import org.junit.runner.RunWith;

@RunWith(CucumberWithProperties.class)
@CucumberOptions(
        features = "classpath:features/datastore/Datastore.feature",
        glue = {"org.eclipse.kapua.qa.common",
                "org.eclipse.kapua.service.datastore.steps",
                "org.eclipse.kapua.service.account.steps",
                "org.eclipse.kapua.service.user.steps",
                "org.eclipse.kapua.service.device.registry.steps"},
        plugin = {"pretty",
                "html:target/cucumber/DatastoreTransportI9n",
                "json:target/DatastoreTransportI9n_cucumber.json"},
        strict = true,
        monochrome = true)
@CucumberProperty(key = "broker.ip", value = "192.168.33.10")
@CucumberProperty(key = "commons.settings.hotswap", value = "true")
@CucumberProperty(key = "datastore.elasticsearch.nodes", value = "127.0.0.1:9300")
@CucumberProperty(key = "datastore.elasticsearch.provider", value = "org.eclipse.kapua.service.elasticsearch.client.transport.TransportElasticsearchClientProvider")
@CucumberProperty(key = "datastore.index.prefix", value = "")
@CucumberProperty(key = "kapua.config.url", value = "")
@CucumberProperty(key = "org.eclipse.kapua.qa.broker.extraStartupDelay", value = "3")
@CucumberProperty(key = "org.eclipse.kapua.qa.datastore.extraStartupDelay", value = "5")
public class RunDatastoreTransportI9nTest {
}



