package org.apache.batik.css.parser4android;

import java.io.IOException;
import java.io.StringReader;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;


public class Parser extends org.apache.batik.css.parser.Parser {
    private static final class AndroidLocalizableSupport extends org.apache.batik.i18n.LocalizableSupport {
        private static final String sMessages = "" +
                "# -----------------------------------------------------------------------------\n" +
                "#\n" +
                "#   Licensed to the Apache Software Foundation (ASF) under one or more\n" +
                "#   contributor license agreements.  See the NOTICE file distributed with\n" +
                "#   this work for additional information regarding copyright ownership.\n" +
                "#   The ASF licenses this file to You under the Apache License, Version 2.0\n" +
                "#   (the \"License\"); you may not use this file except in compliance with\n" +
                "#   the License.  You may obtain a copy of the License at\n" +
                "#\n" +
                "#       http://www.apache.org/licenses/LICENSE-2.0\n" +
                "#\n" +
                "#   Unless required by applicable law or agreed to in writing, software\n" +
                "#   distributed under the License is distributed on an \"AS IS\" BASIS,\n" +
                "#   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n" +
                "#   See the License for the specific language governing permissions and\n" +
                "#   limitations under the License.\n" +
                "#\n" +
                "# The error messages for the CSS parser.\n" +
                "#\n" +
                "# Author: stephane@hillion.org\n" +
                "# $Id$\n" +
                "# -----------------------------------------------------------------------------\n" +
                "\n" +
                "charset.string = \\\n" +
                "A string was expected in a @charset rule.\n" +
                "\n" +
                "semicolon = \\\n" +
                "';' expected.\n" +
                "\n" +
                "colon = \\\n" +
                "':' expected.\n" +
                "\n" +
                "eof = \\\n" +
                "Unexpected end of file.\n" +
                "\n" +
                "eof.expected = \\\n" +
                "End of file expected.\n" +
                "\n" +
                "character = \\\n" +
                "Unexpected character.\n" +
                "\n" +
                "string.or.uri = \\\n" +
                "String or URI expected.\n" +
                "\n" +
                "identifier = \\\n" +
                "Identifier expected.\n" +
                "\n" +
                "identifier.character = \\\n" +
                "Invalid identifier start character.\n" +
                "\n" +
                "identifier.or.string = \\\n" +
                "Identifier or string expected.\n" +
                "\n" +
                "left.curly.brace = \\\n" +
                "'{' expected.\n" +
                "\n" +
                "right.curly.brace = \\\n" +
                "'}' expected.\n" +
                "\n" +
                "right.brace = \\\n" +
                "')' expected.\n" +
                "\n" +
                "right.bracket = \\\n" +
                "']' expected.\n" +
                "\n" +
                "token = \\\n" +
                "Unexpected token: {0} (see LexicalUnits).\n" +
                "\n" +
                "rgb.color = \\\n" +
                "Invalid RGB color: {0}.\n" +
                "\n" +
                "encoding = \\\n" +
                "Invalid encoding: {0}.\n" +
                "\n" +
                "number.format = \\\n" +
                "Invalid number.\n" +
                "\n" +
                "duplicate.pseudo.element = \\\n" +
                "A pseudo element has already been defined.\n" +
                "\n" +
                "pseudo.element.position = \\\n" +
                "Pseudo element cannot occur before the end of the selector.\n" +
                "\n" +
                "pseudo.function = \\\n" +
                "Invalid pseudo-function.\n" +
                "\n" +
                "empty.source = \\\n" +
                "Empty input source.\n";

        public AndroidLocalizableSupport(String bundleClassname, ClassLoader classLoader) {
            super(bundleClassname, classLoader);
        }

        @Override
        protected ResourceBundle lookupResourceBundle(String bundle, @SuppressWarnings("rawtypes") Class cls) {
            final StringReader reader = new StringReader(sMessages);
            try {
                return new PropertyResourceBundle(reader);
            }
            catch (IOException e) {
                return super.lookupResourceBundle(bundle, cls);
            }
        }
    }

    public Parser() {
        super();
        localizableSupport = new AndroidLocalizableSupport(BUNDLE_CLASSNAME, Parser.class.getClassLoader());
    }
}
