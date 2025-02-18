/*
 * MIT License
 *
 * Copyright (c) 2025 Giuseppe Calabrese
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package it.unicam.cs.asdl2425.pt1;

/**
 * Parametri generali del framework di valutazione degli algoritmi di
 * ordinamento.
 *
 * @author Luca Tesei
 *
 */
public interface SortingAlgorithmEvaluationFrameworkParameters {
    /**
     * Lunghezza minima delle sequenze da generare
     */
    public static int MIN_LENGTH = 50;

    /**
     * Passo di incremento della lunghezza da MIN_LENGTH a MAX_LENGTH
     */
    public static int INCREMENTO_LUNGHEZZA = 50;

    /**
     * Lunghezza massima delle sequenze da generare
     */
    public static int MAX_LENGTH = 1500;

    /**
     * Numero di sequenze da generare per lunghezza
     */
    public static int NUMBER_OF_SAMPLES_PER_LENGTH = 100;

    /**
     * Maximum non-negative integer number randomly generated in sample
     * sequences
     */
    public static int MAX_GENERATED_INTEGER = 1500;

}
