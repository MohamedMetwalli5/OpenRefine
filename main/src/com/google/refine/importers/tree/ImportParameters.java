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
package com.google.refine.importers.tree;


public class ImportParameters {
    protected boolean trimStrings;
    protected boolean storeEmptyStrings;
    protected boolean guessDataType;
    protected boolean includeFileSources = false;
    protected String fileSource = null;
    // TODO: What is the compatibility impact of including new fields
    protected boolean includeArchiveFileName = false;
    protected String archiveFileName = null;

    public ImportParameters(boolean trimStrings, boolean storeEmptyStrings, boolean guessCellValueTypes,
            boolean includeFileSources, String fileSource, boolean includeArchiveFileName, String archiveFileName) {
        this.trimStrings = trimStrings;
        this.storeEmptyStrings = storeEmptyStrings;
        this.guessDataType = guessCellValueTypes;
        this.includeFileSources = includeFileSources;
        this.fileSource = fileSource;
        this.includeArchiveFileName = includeArchiveFileName;
        this.archiveFileName = archiveFileName;
    }

    public ImportParameters(boolean trimStrings, boolean storeEmptyStrings, boolean guessCellValueTypes,
            boolean includeFileSources, String fileSource) {
        this(trimStrings, storeEmptyStrings, guessCellValueTypes, includeFileSources, fileSource, false, "");
    }
    
    public ImportParameters(boolean trimStrings, boolean storeEmptyStrings, boolean guessCellValueTypes) {
        this(trimStrings, storeEmptyStrings, guessCellValueTypes, false, "");
    }
    
}
