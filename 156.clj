;; Map Defaults - http://www.4clojure.com/problem/156
(fn [d s]
  (reduce #(assoc %1 %2 d) {} s))
