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
  - zus�tzlicher Branch innerhalb des Loop mit zwei Verzweigungen
  - zus�tzliche Faktor f�r die Anzahl der Schleifendurchl�ufe 
- begin / commit transaction hat eine Fehlerwahrscheinlichkeit von: 0.000001
- �ndere Data.Store.queryStockItem():
  - enth�lt nur noch eine Database-Query-Anfrage (Vereinfachung)
  
  
--------------------------------------------------------------------
Lessons learned
--------------------------------------------------------------------

- Ein Integer kann in einer StochasticExpression nicht mit einem Double multpliziert werden!
- Der DependencySolver kann nur mit ganzzahligen LoopIteration-Counts arbeiten!  