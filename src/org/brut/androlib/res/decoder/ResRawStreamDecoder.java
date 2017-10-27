/**
 *  Copyright (C) 2017 Ryszard Wiśniewski <org.brut.alll@gmail.com>
 *  Copyright (C) 2017 Connor Tumbleson <connor.tumbleson@gmail.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.brut.androlib.res.decoder;

import org.brut.androlib.AndrolibException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;

/**
 * @author Ryszard Wiśniewski <org.brut.alll@gmail.com>
 */
public class ResRawStreamDecoder implements ResStreamDecoder {
    @Override
    public void decode(InputStream in, OutputStream out)
            throws AndrolibException {
        try {
            IOUtils.copy(in, out);
        } catch (IOException ex) {
            throw new AndrolibException("Could not decode raw stream", ex);
        }
    }
}
