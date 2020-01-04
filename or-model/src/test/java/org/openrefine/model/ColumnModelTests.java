/*******************************************************************************
 * Copyright (C) 2018, OpenRefine contributors
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 ******************************************************************************/
package org.openrefine.model;

import org.openrefine.model.Column;
import org.openrefine.model.ColumnModel;
import org.openrefine.model.ModelException;
import org.openrefine.util.ParsingUtilities;
import org.openrefine.util.TestUtils;
import org.testng.annotations.Test;

public class ColumnModelTests {
    @Test
    public void serializeColumnModel() throws ModelException {
        ColumnModel model = new ColumnModel();
        model.addColumn(0, new Column(0, "a"), false);
        model.addColumn(1, new Column(1, "b"), false);
        String json = "{\n" + 
                "       \"columnGroups\" : [ ],\n" + 
                "       \"columns\" : [ {\n" + 
                "         \"cellIndex\" : 0,\n" + 
                "         \"constraints\" : \"{}\",\n" + 
                "         \"description\" : \"\",\n" + 
                "         \"format\" : \"default\",\n" + 
                "         \"name\" : \"a\",\n" + 
                "         \"originalName\" : \"a\",\n" + 
                "         \"title\" : \"\",\n" + 
                "         \"type\" : \"\"\n" + 
                "       }, {\n" + 
                "         \"cellIndex\" : 1,\n" + 
                "         \"constraints\" : \"{}\",\n" + 
                "         \"description\" : \"\",\n" + 
                "         \"format\" : \"default\",\n" + 
                "         \"name\" : \"b\",\n" + 
                "         \"originalName\" : \"b\",\n" + 
                "         \"title\" : \"\",\n" + 
                "         \"type\" : \"\"\n" + 
                "       } ],\n" + 
                "       \"keyCellIndex\" : 0,\n" + 
                "       \"keyColumnName\" : \"a\"\n" + 
                "     }";
        TestUtils.isSerializedTo(model, json, ParsingUtilities.defaultWriter);
    }
    
    @Test
    public void serializeColumnModelEmpty() {
        String json = "{"
                + "\"columns\":[],"
                + "\"columnGroups\":[]"
                + "}";
        ColumnModel m = new ColumnModel();
        TestUtils.isSerializedTo(m, json, ParsingUtilities.defaultWriter);
    }
}