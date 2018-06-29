;; Group a Sequence - http://www.4clojure.com/problem/63
(fn [f s]
  (loop [m (transient {})
         v s]
    (if (empty? v)
      (persistent! m)
      (let [e (first v)
            r (rest v)
            fx (f e)]
        (recur (assoc! m fx (conj (get m fx []) e)) r)))))
