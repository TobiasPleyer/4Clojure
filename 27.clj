;; Palindrome Detector - http://www.4clojure.com/problem/27
(fn [x]
  (let [length (count x)
        half (int (Math/ceil (/ length 2)))
        indices (range 0 (inc half))
        fst_half (map #(nth x %) indices)
        snd_half (map #(nth x (- (dec length) %)) indices)
        pairs (map vector fst_half snd_half)
        fcmp (partial apply =)
        cmps (map fcmp pairs)]
    (reduce 'and true cmps)))
