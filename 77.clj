;; Anagram Finder - http://www.4clojure.com/problem/77
(fn [s]
  (loop [ws s
         freqss {}]
    (if (empty? ws)
      (->> freqss
           vals
           (map set)
           (filter #(< 1 (count %)))
           set)
      (let [w (first ws)
            freqs (frequencies w)
            update (fn [m k f x] (assoc m k (f (get m k) x)))
            updater (fn [old x] (if (nil? old) [x] (conj old x)))]
        (recur (rest ws) (update freqss freqs updater w))))))
