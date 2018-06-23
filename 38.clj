;; Maximum value - http://www.4clojure.com/problem/38
(fn my-max [& elems]
  (reduce (fn [a b] (if (> a b) a b)) elems))
