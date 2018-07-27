;; Word Sorting - http://www.4clojure.com/problem/70
(fn [string]
  (let [unwords (fn [s]
                  (filter (complement #{\! \, \. \? \:}) (seq s)))
        words (fn ws [s]
                (if (empty? s)
                  '()
                  (let [[cs css] (split-with #(not= \space %) s)]
                    (cons (apply str cs) (ws (rest css))))))
        to-lower (fn [s] (->> s
                              seq
                              (map (fn [c]
                                     (let [i (int c)]
                                       (if (> 97 i)
                                         (char (+ 32 i))
                                         c))))
                              (apply str)))]
    (->> string
         unwords
         words
         (sort-by to-lower compare))))
