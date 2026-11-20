$proxy = 'http://user:pass@gate.ipdunar.com:7777';
$ch = curl_init();

curl_setopt($ch, CURLOPT_URL, 'https://api.target.com/v1/data');
curl_setopt($ch, CURLOPT_PROXY, $proxy);
curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
$res = curl_exec($ch);
curl_close($ch);