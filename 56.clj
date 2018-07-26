;; Find Distinct Items - http://www.4clojure.com/problem/56
(fn [s]
  (loop [seen #{}
         result []
         remaining s]
    (let [elem (first remaining)]
      (cond
        (nil? elem) result
        (contains? seen elem) (recur seen result (rest remaining))
        :else (recur (conj seen elem) (conj result elem) (rest remaining))))))
