;; Flatten a Sequence - http://www.4clojure.com/problem/28
(fn my-flatten [s]
  (let [mk-ISeq (fn [x]
                  (if (not (sequential? x))
                    (list x)
                    x))
        flat? (fn [s] (every? #(not (sequential? %)) s))]
    (loop [result s]
      (if (flat? result)
        result
        (recur (apply concat (map mk-ISeq result)))))))
