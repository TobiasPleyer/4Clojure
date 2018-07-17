;; Flipping out - http://www.4clojure.com/problem/46
(fn [f]
  (fn [a b]
    (f b a)))
