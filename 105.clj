;; Identify keys and values - http://www.4clojure.com/problem/105
(fn [s]
  (loop [result {}
         input s]
    (if-let [k (first input)]
      (let [[v remaining-input] (split-with (complement keyword?) (rest input))]
      	(recur (assoc result k (vec v)) remaining-input))
      result)))
