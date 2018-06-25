;; Compress a Sequence - http://www.4clojure.com/problem/30
(fn compress [s]
  (let [last-seen (atom nil)]
    (loop [elems s
           result '()]
      (if (empty? elems)
        (reverse result)
        (if (= (first elems) @last-seen)
          (recur (rest elems) result)
          (do
            (reset! last-seen (first elems))
            (recur (rest elems) (conj result (first elems)))))))))