;; Pascal's Trapezoid - http://www.4clojure.com/problem/147
(fn pascal-trapezoid [row]
  (lazy-seq
    (let [new-row (conj
                    (vec
                      (cons 
                        (first row)
                        (map (partial apply +') (partition 2 1 row))))
                    (last row))]
      (cons row (pascal-trapezoid new-row)))))