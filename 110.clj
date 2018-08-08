;; Sequence of pronunciations - http://www.4clojure.com/problem/110
(fn [s]
  (let [pronounce (fn [s]
                    (loop [pronounciation []
                           input s]
                      (if-let [fst (first input)]
                        (let [[same not-same] (split-with #(= % fst) input)]
                          (recur (conj pronounciation (count same) fst) not-same))
                        pronounciation)))]
    (drop 1 (iterate pronounce s))))
