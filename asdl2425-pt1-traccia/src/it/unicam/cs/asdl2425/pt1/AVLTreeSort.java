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


/**
 *
 */
package it.unicam.cs.asdl2425.pt1;

import java.util.List;
import java.util.Objects;

/**
 * Algoritmo di ordinamento che usa un albero AVL con molteplicità per ordinare
 * una lista di elementi. La strategia di realizzazione è semplice: si
 * inseriscono i valori da ordinare in un AVLTree e poi si fa una visita inOrder
 * per ottenere la lista ordinata di elementi.
 *
 * @author Luca Tesei (template) GIUSEPPE, CALABRESE
 *         giusepp.calabrese@studenti.unicam.it (implementazione)
 *
 */
public class AVLTreeSort<E extends Comparable<E>>
        implements SortingAlgorithm<E> {

   public SortingAlgorithmResult<E> sort(List<E> l) {
      if (l == null) {
        throw new NullPointerException("Impossibile eseguire il Sorting per liste null.");
      }

      // Si crea un albero AVLTree per molteplicità
      AVLTree<E> treeSort = new AVLTree<>();
      int comparisons = 0;

      // Inseriamo gli elementi nell'AVLTree e contiamo i confronti
      for (E element : l) {
        comparisons += treeSort.insert(element);
      }

      // Recuperiamo gli elementi in ordine tramite una visita in-order
      List<E> list = treeSort.inOrderVisit();

      // Creiamo il risultato dell'ordinamento
      return new SortingAlgorithmResult<>(list, comparisons);
    }



    public String getName() {
        return "AVLTreeSort";
    }
}
