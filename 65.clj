;; Black Box Testing - http://www.4clojure.com/problem/65
(fn [s]
  (let [k (gensym)
        s2 (conj s [k 42])]
    (if (contains? s2 k)
      :map
      (let [cnt (count s)
            s2 (-> s
                   (conj 1)
                   (conj 2)
                   (conj 2))]
       (cond
         (< (count s2) (+ cnt 3)) :set
         (= 1 (first s2)) :vector
         (= 2 (first s2)) :list
         :else (do
                 (println "Bad argument!")))))))
