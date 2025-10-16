const response = await fetch('https://language-translation-backend-8qxh.onrender.com/translate', {
  method: 'POST',
  headers: { 'Content-Type': 'application/json' },
  body: JSON.stringify({ text: originalText, targetLang: lang })
});
