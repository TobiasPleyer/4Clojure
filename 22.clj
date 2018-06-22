;; Count a Sequence - http://www.4clojure.com/problem/22
#(reduce + 0 (map (constantly 1) %))
