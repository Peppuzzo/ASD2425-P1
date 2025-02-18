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

import java.util.List;

/**
 * Interfaccia per algoritmi di ordinamento generici.
 *
 * @author Luca Tesei
 *
 * @param <E>
 *            Tipo degli elementi delle sequenze da ordinare. La classe E deve
 *            avere un ordinamento naturale totale fra i suoi elementi
 *            realizzato tramite l'implementazione dell'interfaccia Comparable.
 */
public interface SortingAlgorithm<E extends Comparable<E>> {

    /**
     * Ordina una lista di elementi in accordo all'ordinamento totale naturale
     * definito nella classe degli elementi.
     *
     * @param l
     *              la lista da ordinare (dovrebbe essere una ArrayList)
     * @return un oggetto contentente la lista ordinata e il numero di
     *         operazioni di comparazione effettuate dall'algoritmo.
     */
    public SortingAlgorithmResult<E> sort(List<E> l);

    /**
     * Restituisce il nome dell'algoritmo di ordinamento.
     *
     * @return il nome dell'algoritmo
     */
    public String getName();

}
