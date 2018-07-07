;; Trees into tables - http://www.4clojure.com/problem/146
(fn [m]
  (reduce
    #(apply assoc %1 %2)
    {}
    (for [k1 m
          k2 (second k1)]
      [[(first k1) (first k2)] (second k2)])))