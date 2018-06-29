;; Product Digits - http://www.4clojure.com/problem/99
(fn [n m]
  (map (comp #(- % 48) int) (seq (str (* n m)))))
