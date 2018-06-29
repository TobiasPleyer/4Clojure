;; Set Intersection - http://www.4clojure.com/problem/81
(fn set-intersect [s1 s2]
  (let [s1-unique (apply disj s1 s2)
        s2-unique (apply disj s2 s1)
        union (apply conj s1 s2)
        unique-union (apply conj s1-unique s2-unique)]
    (apply disj union unique-union)))
