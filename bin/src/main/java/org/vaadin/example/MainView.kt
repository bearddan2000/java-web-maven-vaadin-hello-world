/*
 * Copyright 2000-2017 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.vaadin.example

import com.github.mvysny.karibudsl.v10.*
import com.github.mvysny.kaributools.setPrimary
import com.vaadin.flow.component.Key
import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.dependency.CssImport
import com.vaadin.flow.component.notification.Notification
import com.vaadin.flow.component.page.AppShellConfigurator
import com.vaadin.flow.component.textfield.TextField
import com.vaadin.flow.router.Route
import com.vaadin.flow.server.PWA

/**
 * The main view contains a button and a click listener.
 */
@Route("")
class MainView : KComposite() {
    private lateinit var nameField: TextField

    // The main view UI definition
    private val root = ui {
        verticalLayout {
            // Use custom CSS classes to apply styling. This is defined in shared-styles.css.
            addClassName("centered-content")

            // Use TextField for standard text input
            nameField = textField("Hello World")
        }
    }
}

@PWA(name = "Project Base for Vaadin", shortName = "Project Base")
class AppShell: AppShellConfigurator
