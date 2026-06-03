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

Since this folder is inside your existing `JAVA` git repository, we have already pushed the files to GitHub!

To make your website live on the internet, just enable GitHub Pages on that repository:

1. Open your browser and go to your repository on GitHub: `https://github.com/SATYA-GARLAPATI09/JAVA`
2. Click on the **Settings** tab (the gear icon at the top).
3. On the left sidebar, click **Pages** (under the "Code and automation" section).
4. Under **Build and deployment** -> **Source**, make sure **Deploy from a branch** is selected.
5. Under **Branch**, select the **`main`** branch (or whichever branch is your default) and leave the folder as `/ (root)`.
6. Click **Save**.
7. In 1-2 minutes, refresh the page. You will see your live URL at the top:
   `https://satya-garlapati09.github.io/JAVA/workers%20app/` (or `https://satya-garlapati09.github.io/JAVA/workers%20app/index.html`)

