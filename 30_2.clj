;; Compress a Sequence - http://www.4clojure.com/problem/30
(fn compress [s]
  (let [compressor (fn [result input]
                     (if (= (first result) input)
                       result
                       (conj result input)))]
    (reverse (reduce compressor '() s))))