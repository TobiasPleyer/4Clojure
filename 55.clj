;; Count Occurrences - http://www.4clojure.com/problem/55
(fn [elems]
  (let [ks (set elems)
        reducer (fn [m kv]
                  (assoc m (first kv) (second kv)))]
    (reduce reducer
            {}
            (for [k ks]
              (list k (count (filter #(= k %) elems)))))))
