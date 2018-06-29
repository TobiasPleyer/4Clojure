;; Comparisons - http://www.4clojure.com/problem/166
(fn [lt x y]
  (if (lt x y)
    (if (lt y x)
      :eq
      :lt)
    (if (lt y x)
      :gt
      :eq)))
