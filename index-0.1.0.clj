{:namespaces
 ({:doc "Basic graph theory algorithms",
   :author "Jeffrey Straszheim",
   :name "clojure.algo.graph",
   :wiki-url
   "http://clojure.github.com/algo.graph/clojure.algo.graph-api.html",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj"}),
 :vars
 ({:raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :name "add-loops",
   :file "src/main/clojure/clojure/algo/graph.clj",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L49",
   :line 49,
   :var-type "function",
   :arglists ([g]),
   :doc "For each node n, add the edge n->n if not already present.",
   :namespace "clojure.algo.graph",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/add-loops"}
  {:raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :name "component-graph",
   :file "src/main/clojure/clojure/algo/graph.clj",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L133",
   :line 133,
   :var-type "function",
   :arglists ([g] [g sccs]),
   :doc
   "Given a graph, perhaps with cycles, return a reduced graph that is acyclic.\nEach node in the new graph will be a set of nodes from the old.\nThese sets are the strongly connected components.  Each edge will\nbe the union of the corresponding edges of the prior graph.",
   :namespace "clojure.algo.graph",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/component-graph"}
  {:raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :name "dependency-list",
   :file "src/main/clojure/clojure/algo/graph.clj",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L190",
   :line 190,
   :var-type "function",
   :arglists ([g]),
   :doc
   "Similar to a topological sort, this returns a vector of sets. The\nset of nodes at index 0 are independent.  The set at index 1 depend\non index 0; those at 2 depend on 0 and 1, and so on.  Those withing\na set have no mutual dependencies.  Assume the input graph (which\nmuch be acyclic) has an edge a->b when a depends on b.",
   :namespace "clojure.algo.graph",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/dependency-list"}
  {:raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :name "fixed-point",
   :file "src/main/clojure/clojure/algo/graph.clj",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L167",
   :line 167,
   :var-type "function",
   :arglists ([data fun max equal]),
   :doc
   "Repeatedly apply fun to data until (equal old-data new-data)\nreturns true.  If max iterations occur, it will throw an\nexception.  Set max to nil for unlimited iterations.",
   :namespace "clojure.algo.graph",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/fixed-point"}
  {:raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :name "get-neighbors",
   :file "src/main/clojure/clojure/algo/graph.clj",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L29",
   :line 29,
   :var-type "function",
   :arglists ([g n]),
   :doc "Get the neighbors of a node.",
   :namespace "clojure.algo.graph",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/get-neighbors"}
  {:raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :name "lazy-walk",
   :file "src/main/clojure/clojure/algo/graph.clj",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L68",
   :line 68,
   :var-type "function",
   :arglists ([g n] [g ns v]),
   :doc
   "Return a lazy sequence of the nodes of a graph starting a node n.  Optionally,\nprovide a set of visited notes (v) and a collection of nodes to\nvisit (ns).",
   :namespace "clojure.algo.graph",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/lazy-walk"}
  {:raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :name "post-ordered-nodes",
   :file "src/main/clojure/clojure/algo/graph.clj",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L110",
   :line 110,
   :var-type "function",
   :arglists ([g]),
   :doc
   "Return a sequence of indexes of a post-ordered walk of the graph.",
   :namespace "clojure.algo.graph",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/post-ordered-nodes"}
  {:raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :name "recursive-component?",
   :file "src/main/clojure/clojure/algo/graph.clj",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L151",
   :line 151,
   :var-type "function",
   :arglists ([g ns]),
   :doc "Is the component (recieved from scc) self recursive?",
   :namespace "clojure.algo.graph",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/recursive-component?"}
  {:raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :name "remove-loops",
   :file "src/main/clojure/clojure/algo/graph.clj",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L57",
   :line 57,
   :var-type "function",
   :arglists ([g]),
   :doc "For each node n, remove any edges n->n.",
   :namespace "clojure.algo.graph",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/remove-loops"}
  {:raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :name "reverse-graph",
   :file "src/main/clojure/clojure/algo/graph.clj",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L37",
   :line 37,
   :var-type "function",
   :arglists ([g]),
   :doc
   "Given a directed graph, return another directed graph with the\norder of the edges reversed.",
   :namespace "clojure.algo.graph",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/reverse-graph"}
  {:raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :name "scc",
   :file "src/main/clojure/clojure/algo/graph.clj",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L117",
   :line 117,
   :var-type "function",
   :arglists ([g]),
   :doc
   "Returns, as a sequence of sets, the strongly connected components\nof g.",
   :namespace "clojure.algo.graph",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/scc"}
  {:raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :name "self-recursive-sets",
   :file "src/main/clojure/clojure/algo/graph.clj",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L158",
   :line 158,
   :var-type "function",
   :arglists ([g]),
   :doc
   "Returns, as a sequence of sets, the components of a graph that are\nself-recursive.",
   :namespace "clojure.algo.graph",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/self-recursive-sets"}
  {:raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :name "stratification-list",
   :file "src/main/clojure/clojure/algo/graph.clj",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L207",
   :line 207,
   :var-type "function",
   :arglists ([g1 g2]),
   :doc
   "Similar to dependency-list (see doc), except two graphs are\nprovided.  The first is as dependency-list.  The second (which may\nhave cycles) provides a partial-dependency relation.  If node a\ndepends on node b (meaning an edge a->b exists) in the second\ngraph, node a must be equal or later in the sequence.",
   :namespace "clojure.algo.graph",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/stratification-list"}
  {:raw-source-url
   "https://github.com/clojure/algo.graph/raw/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj",
   :name "transitive-closure",
   :file "src/main/clojure/clojure/algo/graph.clj",
   :source-url
   "https://github.com/clojure/algo.graph/blob/03c740c61aecb55225bdad19813e316f44837142/src/main/clojure/clojure/algo/graph.clj#L81",
   :line 81,
   :var-type "function",
   :arglists ([g]),
   :doc
   "Returns the transitive closure of a graph.  The neighbors are lazily computed.\n\nNote: some version of this algorithm return all edges a->a\nregardless of whether such loops exist in the original graph.  This\nversion does not.  Loops will be included only if produced by\ncycles in the graph.  If you have code that depends on such\nbehavior, call (-> g transitive-closure add-loops)",
   :namespace "clojure.algo.graph",
   :wiki-url
   "http://clojure.github.com/algo.graph//clojure.algo.graph-api.html#clojure.algo.graph/transitive-closure"})}
