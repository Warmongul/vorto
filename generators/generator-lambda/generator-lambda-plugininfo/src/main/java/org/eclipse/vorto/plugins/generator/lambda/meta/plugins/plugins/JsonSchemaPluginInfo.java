/**
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.vorto.plugins.generator.lambda.meta.plugins.plugins;

import org.eclipse.vorto.codegen.jsonschema.JSONSchemaGenerator;
import org.eclipse.vorto.plugin.generator.GeneratorPluginInfo;

public class JsonSchemaPluginInfo implements IPluginMeta {

  private static final String LOGO_144x144 = "iVBORw0KGgoAAAANSUhEUgAAANgAAADYCAYAAACJIC3tAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAAAAYdEVYdFNvZnR3YXJlAHBhaW50Lm5ldCA0LjAuOWwzfk4AAA1XSURBVHhe7duBsey2DYVhl5ASXEJKcAkuwSWkBHfgElyCS3AJKSEluISXPZnHGYbvkAAh7LWv58fMN4lxJe5KAiRK2vfdly9fALyJTQLoYZMAetgkgB42CaCHTQLoYZMAetgkgB42CaCHTQLoYZMAetgkgB42CaCHTQLoYZMAetgkgB42CaCHTQLoYZMAetgkgB42CaCHTQLoYZMAetgkgB42CaCHTQLoYZMAetgkgB42CaCHTQLoYZMAetgkgB42CaCHTQLoYZMAetgkgB42CaCHTQLoYZMAetgkgB42CaCHTQLoYZMAetgkgB42CaCHTQLoYZMAetgkgB42CaCHTQLoYZMAetgkgB42CaCHTQLoYZMAetgkgB42CaCHTQLoYZMAetgkgB42CaCHTQLoYZMAetgkgB42CaCHTQLoYZMAetgkgB42CaCHTQLoYZMAetgkgB42CaCHTQLoYZMAetgkgB42CaCHTVY9jH";
  private static final String LOGO_32x32 = "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";

  private GeneratorPluginInfo info = null;

  public JsonSchemaPluginInfo() {
    JSONSchemaGenerator jsonSchema = new JSONSchemaGenerator();
    
    info = jsonSchema.getMeta();
    info.setImage144x144(LOGO_144x144);
    info.setImage32x32(LOGO_32x32);
  }

  @Override
  public GeneratorPluginInfo getInfo() {
    return info;
  }
}