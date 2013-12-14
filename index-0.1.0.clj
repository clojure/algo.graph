{:namespaces
 ({:source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :wiki-url
   "http://clojure.github.com/algo.graph/clojure.algo.graph-api.html",
   :name "clojure.algo.graph",
   :author "Jeffrey Straszheim",
   :doc "Basic graph theory algorithms"}),
 :vars
 ({:arglists ([g]),
   :name "add-loops",
   :namespace "clojure.algo.graph",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L49",
   :raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/add-loops",
   :doc "For each node n, add the edge n->n if not already present.",
   :var-type "function",
   :line 49,
   :file "src/main/clojure/clojure/algo/graph.clj"}
  {:arglists ([g] [g sccs]),
   :name "component-graph",
   :namespace "clojure.algo.graph",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L133",
   :raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/component-graph",
   :doc
   "Given a graph, perhaps with cycles, return a reduced graph that is acyclic.\nEach node in the new graph will be a set of nodes from the old.\nThese sets are the strongly connected components.  Each edge will\nbe the union of the corresponding edges of the prior graph.",
   :var-type "function",
   :line 133,
   :file "src/main/clojure/clojure/algo/graph.clj"}
  {:arglists ([g]),
   :name "dependency-list",
   :namespace "clojure.algo.graph",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L190",
   :raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/dependency-list",
   :doc
   "Similar to a topological sort, this returns a vector of sets. The\nset of nodes at index 0 are independent.  The set at index 1 depend\non index 0; those at 2 depend on 0 and 1, and so on.  Those withing\na set have no mutual dependencies.  Assume the input graph (which\nmuch be acyclic) has an edge a->b when a depends on b.",
   :var-type "function",
   :line 190,
   :file "src/main/clojure/clojure/algo/graph.clj"}
  {:arglists ([data fun max equal]),
   :name "fixed-point",
   :namespace "clojure.algo.graph",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L167",
   :raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/fixed-point",
   :doc
   "Repeatedly apply fun to data until (equal old-data new-data)\nreturns true.  If max iterations occur, it will throw an\nexception.  Set max to nil for unlimited iterations.",
   :var-type "function",
   :line 167,
   :file "src/main/clojure/clojure/algo/graph.clj"}
  {:arglists ([g n]),
   :name "get-neighbors",
   :namespace "clojure.algo.graph",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L29",
   :raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/get-neighbors",
   :doc "Get the neighbors of a node.",
   :var-type "function",
   :line 29,
   :file "src/main/clojure/clojure/algo/graph.clj"}
  {:arglists ([g n] [g ns v]),
   :name "lazy-walk",
   :namespace "clojure.algo.graph",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L68",
   :raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/lazy-walk",
   :doc
   "Return a lazy sequence of the nodes of a graph starting a node n.  Optionally,\nprovide a set of visited notes (v) and a collection of nodes to\nvisit (ns).",
   :var-type "function",
   :line 68,
   :file "src/main/clojure/clojure/algo/graph.clj"}
  {:arglists ([g]),
   :name "post-ordered-nodes",
   :namespace "clojure.algo.graph",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L110",
   :raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/post-ordered-nodes",
   :doc
   "Return a sequence of indexes of a post-ordered walk of the graph.",
   :var-type "function",
   :line 110,
   :file "src/main/clojure/clojure/algo/graph.clj"}
  {:arglists ([g ns]),
   :name "recursive-component?",
   :namespace "clojure.algo.graph",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L151",
   :raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/recursive-component?",
   :doc "Is the component (recieved from scc) self recursive?",
   :var-type "function",
   :line 151,
   :file "src/main/clojure/clojure/algo/graph.clj"}
  {:arglists ([g]),
   :name "remove-loops",
   :namespace "clojure.algo.graph",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L57",
   :raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/remove-loops",
   :doc "For each node n, remove any edges n->n.",
   :var-type "function",
   :line 57,
   :file "src/main/clojure/clojure/algo/graph.clj"}
  {:arglists ([g]),
   :name "reverse-graph",
   :namespace "clojure.algo.graph",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L37",
   :raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/reverse-graph",
   :doc
   "Given a directed graph, return another directed graph with the\norder of the edges reversed.",
   :var-type "function",
   :line 37,
   :file "src/main/clojure/clojure/algo/graph.clj"}
  {:arglists ([g]),
   :name "scc",
   :namespace "clojure.algo.graph",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L117",
   :raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/scc",
   :doc
   "Returns, as a sequence of sets, the strongly connected components\nof g.",
   :var-type "function",
   :line 117,
   :file "src/main/clojure/clojure/algo/graph.clj"}
  {:arglists ([g]),
   :name "self-recursive-sets",
   :namespace "clojure.algo.graph",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L158",
   :raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/self-recursive-sets",
   :doc
   "Returns, as a sequence of sets, the components of a graph that are\nself-recursive.",
   :var-type "function",
   :line 158,
   :file "src/main/clojure/clojure/algo/graph.clj"}
  {:arglists ([g1 g2]),
   :name "stratification-list",
   :namespace "clojure.algo.graph",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L207",
   :raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/stratification-list",
   :doc
   "Similar to dependency-list (see doc), except two graphs are\nprovided.  The first is as dependency-list.  The second (which may\nhave cycles) provides a partial-dependency relation.  If node a\ndepends on node b (meaning an edge a->b exists) in the second\ngraph, node a must be equal or later in the sequence.",
   :var-type "function",
   :line 207,
   :file "src/main/clojure/clojure/algo/graph.clj"}
  {:arglists ([g]),
   :name "transitive-closure",
   :namespace "clojure.algo.graph",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L81",
   :raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/transitive-closure",
   :doc
   "Returns the transitive closure of a graph.  The neighbors are lazily computed.\n\nNote: some version of this algorithm return all edges a->a\nregardless of whether such loops exist in the original graph.  This\nversion does not.  Loops will be included only if produced by\ncycles in the graph.  If you have code that depends on such\nbehavior, call (-> g transitive-closure add-loops)",
   :var-type "function",
   :line 81,
   :file "src/main/clojure/clojure/algo/graph.clj"})}
