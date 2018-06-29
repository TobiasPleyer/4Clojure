;; Simple closures - http://www.4clojure.com/problem/107
(fn [n]
  (fn [x]
    (int (Math/pow x n))))
