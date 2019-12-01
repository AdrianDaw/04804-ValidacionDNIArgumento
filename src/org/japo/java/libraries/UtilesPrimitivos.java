/*
 * Copyright 2019 Adrián Pérez Rodríguez - adrianp899@gmail.com .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

/**
 *
 * @author Adrián Pérez Rodríguez - adrianp899@gmail.com
 */

public class UtilesPrimitivos {

    // constantes de analisis
   public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
   
    public static final int calcular(int num, char ctr) {
        int result;
        double dniNum = num % 23;
        char letraOK = LETRAS.charAt((int) dniNum);

        if (ctr == letraOK) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }

    public static final String validar(int val) {
        String validez = "";
        switch (val) {
            case 1:
                validez = "Validez ..: Correcto";
                break;
            case 0:
                validez = "Validez ..: Incorrecto";
                break;
        }
        return validez;
    }
}

