;; Black Box Testing - http://www.4clojure.com/problem/65
(fn [s]
  (let [k (gensym)
        s2 (conj s [k 42])]
    (if (= 42 (get s2 k))
      :map
      (let [k1 (gensym)
            k2 (gensym)
            cnt (count s)
            s2 (-> s
                   (conj k1)
                   (conj k2)
                   (conj k2))]
       (cond
         (< (count s2) (+ cnt 3)) :set
         (= k2 (last s2)) :vector
         (= k2 (first s2)) :list
         :else (do
                 (println "Bad argument!")))))))
