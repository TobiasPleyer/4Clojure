;; Lazy Searching - http://www.4clojure.com/problem/108
(fn [s & ss]
  (let [smaller (fn [x]
                  (fn [y]
                    (< y x)))]
    (loop [s s
           ss ss]
      (let [smallest (first s)
            ss2 (map #(drop-while (smaller smallest) %) ss)]
        (if (every? #(= smallest (first %)) ss2)
          smallest
          (recur (rest s) ss2))))))
