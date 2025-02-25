<p align="center">
  <img src="https://istituto.ingv.it/images/logo_unicam.jpg" alt="Diagramma del Progetto" width="180">
</p>

<p align="center">Questo repository contiene il progetto completo per il corso di laurea "Algoritmi e Strutture Dati" per l'anno accademico 2024/2025. </p>

## Descrizione del Progetto

Il progetto si compone dei seguenti task:

- **Albero AVL:** Implementazione in Java di un albero binario di ricerca AVL.
- **AVLTreeSort:** Implementazione in Java di un algoritmo di ordinamento.
- **Heap3Sort:** Implementazione in Java di un algoritmo di ordinamento basato su uno heap ternario che:
  - Utilizza un MaxHeap Ternario e le relative operazioni di *heapify* ed estrazione del minimo.
  - Restituisce l'ArrayList ordinato e il numero di confronti effettuati.
- **Valutazione delle Prestazioni:** Analisi numerica delle performance degli algoritmi di ordinamento implementati.
- **Test JUnit:** Aggiunta di una suite di test unitari per verificare la correttezza delle implementazioni.

## Algoritmi di Ordinamento

Entrambe le implementazioni (AVLTreeSort e Heap3Sort) sono algoritmi di ordinamento basati sul confronto e ottimali <font color="red">complessità O(n log n)</font>.

- **AVLTreeSort:** Si basa sulla proprietà di bilanciamento dell'albero AVL per garantire un inserimento e una visita in-order efficienti.  
- **Heap3Sort:** Adatta le operazioni tipiche di un heap (heapify ed estrazione) ad un heap ternario, ottenendo un algoritmo in loco e con buone performance.

## Test JUnit

Per l'esecuzione dei test unitari si utilizza il framework [JUnit 5](https://junit.org/junit5/docs/current/user-guide/).  
Per la generazione del documento si utilizza la distribuzione [TeX Live](https://www.tug.org/texlive/acquire-netinstall.html).

## Come Eseguire il Progetto

### Requisiti
- **Java JDK 8** (o superiore)
- **JUnit 5** per i test unitari
- **TeX Live** per la documentazione dei grafici

### Istruzioni
1. **Clonare il Repository:**
   ```bash
   git clone https://github.com/tuo-username/ASD2425-P1.git
