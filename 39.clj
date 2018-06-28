;; Interleave Two Seqs - http://www.4clojure.com/problem/39
(fn [x y]
  (let [s1 (atom x)
        s2 (atom y)
        result (atom [])]
    (while (not (some empty? (list @s1 @s2)))
      (do
        (swap! result conj (first @s1))
        (swap! result conj (first @s2))
        (swap! s1 rest)
        (swap! s2 rest)))
    @result))