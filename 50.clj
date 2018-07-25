;; Split by Type - http://www.4clojure.com/problem/50
(fn [sequ]
  (let [updater (fn [m v]
                  (let [t (type v)
                        curr (get m t)]
                    (if (nil? curr)
                      (assoc! m t [v])
                      (assoc! m t (conj curr v)))))]
    (vals (persistent! (reduce updater (transient {}) sequ)))))
