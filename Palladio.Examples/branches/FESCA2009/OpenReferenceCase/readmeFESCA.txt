--------------------------------------------------------------------
PCM Model Instance of CoCoME
--------------------------------------------------------------------
see:
- http://cocome.org/
- http://sdqweb.ipd.uka.de/wiki/CoCoME-PCM
--------------------------------------------------------------------


--------------------------------------------------------------------
Adaptation of ORC for FESCA 2009 Paper
--------------------------------------------------------------------

- mehr Komplexit�t f�r Application.Store.bookSale():
  - zus�tzlicher Branch innerhalb des Loop
  - zus�tzliche Faktor 0.95 f�r die Anzahl der Schleifendurchl�ufe
- alle primitiven Operationen der Datenbank haben eine Fehlerwahrscheinlichkeit von: 0.00001
- �ndere Data.Store.queryStockItem():
  - enth�lt nur noch eine Database-Query-Anfrage (Vereinfachung)