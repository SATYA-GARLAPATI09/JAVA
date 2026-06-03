# SiteTrack Pro 🚧

**SiteTrack Pro** is a modern, responsive, mobile-first web application designed for construction site managers to track worker attendance, approve registrations, manage tasks, and view site analytics on the go.

The application is built as a single-file, highly-optimized static web app, making it extremely fast, fully responsive, and easy to deploy.

---

## 📱 Features

- **Mobile-First Design**: Optimized for mobile screens, notches, and touch interaction, utilizing modern UI patterns (bottom-sheet modals, floating action buttons, toggle switches, and tab-based navigation).
- **Dashboard & Analytics**: Track present workers, pending approvals, active tasks, and overall attendance rate.
- **Worker Management**:
  - Register new workers.
  - Approve/reject pending registrations.
  - Toggle attendance statuses.
  - Search and filter workers.
- **Task Tracker**: Create, organize, and assign construction site tasks.
- **Modern UI/UX**: Dark mode styling, smooth micro-animations, glassmorphism elements, and clear feedback toast notifications.
- **Local Database**: Self-contained state using browser `localStorage` (no database server required).

---

## 🔐 Credentials (Admin)

For admin actions (such as approving/rejecting workers or deleting tasks), use the default admin credentials:

- **Username**: `admin`
- **Password**: `admin123`

*Note: These credentials will reset to defaults on page load.*

---

## 🚀 Running Locally

Since SiteTrack Pro is a static HTML page, you can run it immediately without any setup:

1. Double-click the `index.html` file to open it in any modern browser.
2. Alternatively, serve it locally using Python or Node:
   ```bash
   # Using Python 3
   python -m http.server 8000
   
   # Using Node (npx)
   npx serve
   ```
   Then open `http://localhost:8000` or `http://localhost:3000` in your browser.

---

## ☁️ Deployment to GitHub Pages

To host this live on GitHub Pages:

1. Create a new repository on GitHub named `sitetrack-pro`.
2. Connect your local folder to your remote repository:
   ```bash
   git remote add origin https://github.com/SATYA-GARLAPATI09/sitetrack-pro.git
   git branch -M main
   git push -u origin main
   ```
3. Enable GitHub Pages:
   - Go to your repository settings on GitHub.
   - Click **Pages** on the left menu.
   - Under **Build and deployment**, select **Deploy from a branch**.
   - Select the `main` branch and `/ (root)` folder.
   - Click **Save**.
   - Your site will be live at `https://SATYA-GARLAPATI09.github.io/sitetrack-pro/` in a few minutes!
