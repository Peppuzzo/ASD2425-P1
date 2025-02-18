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
 * Risultato di un algoritmo di ordinamento. Contiene la sequenza ordinata di
 * elementi e il numero di operazioni di confronto effettuate.
 *
 * @author Luca Tesei
 *
 * @param <E>
 *                Tipo degli elementi della sequenza ordinata.
 */
public class SortingAlgorithmResult<E extends Comparable<E>> {

    private List<E> l;

    private int countCompare;

    /**
     * Costruisce un risultato di un algoritmo di odinamento.
     *
     * @param l
     *                         una lista ordinata in maniera crescente
     * @param countCompare
     *                         numero di operazioni di confronto effettuate
     *                         durante l'ordinamento
     */
    public SortingAlgorithmResult(List<E> l, int countCompare) {
        this.l = l;
        this.countCompare = countCompare;
    }

    /**
     * Restituisce la lista ordinata.
     *
     * @return la lista ordinata
     */
    public List<E> getL() {
        return l;
    }

    /**
     * Restituisce il numero di confronti effettuati.
     *
     * @return il numero di confronti effettuati.
     */
    public int getCountCompare() {
        return countCompare;
    }

    /**
     * Controlla che la lista restituita sia in ordine crescente.
     *
     * @return true se la lista è ordinata in maniera crescente, false
     *         altrimenti
     */
    public boolean checkOrder() {
        for (int i = 0; i < l.size() - 1; i++)
            if (this.l.get(i).compareTo(this.l.get(i+1)) > 0)
                return false;
        return true;
    }

}
